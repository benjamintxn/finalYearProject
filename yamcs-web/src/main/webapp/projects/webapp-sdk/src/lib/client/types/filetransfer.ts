import { WebSocketCall } from '../WebSocketCall';

export interface FileTransferService {
  instance: string;
  name: string;
  localEntities: Entity[];
  remoteEntities: Entity[];
  capabilities: FileTransferCapabilities;
  transferOptions: FileTransferOption[];
}

export interface FileTransferOption {
  name: string;
  type: 'BOOLEAN' | 'DOUBLE' | 'STRING';
  title?: string;
  description?: string;
  associatedText?: string;
  default?: string;
  values?: { value: string, verboseName?: string; }[];
  allowCustomOption?: boolean;
}

export interface FileTransferCapabilities {
  upload: boolean;
  download: boolean;
  reliability: boolean;
  remotePath: boolean;
  fileList: boolean;
  hasTransferType: boolean;
}

export interface Entity {
  name: string;
  id: number;
}

export interface Transfer {
  id: number;
  startTime?: string;
  creationTime: string;
  state: 'RUNNING' | 'PAUSED' | 'FAILED' | 'COMPLETED' | 'CANCELLING' | 'QUEUED';
  bucket: string;
  objectName: string;
  remotePath: string;
  direction: 'UPLOAD' | 'DOWNLOAD';
  totalSize: number;
  sizeTransferred: number;
  failureReason?: string;
  transferType?: string;
}

export interface CreateTransferRequest {
  direction: 'UPLOAD' | 'DOWNLOAD';
  bucket: string;
  objectName: string;
  remotePath: string;
  source: string;
  destination: string;
  options: { [key: string]: boolean | number | string; };
}

export interface TransfersPage {
  transfers: Transfer[];
}

export interface ListFilesRequest {
  source: string;
  destination: string;
  remotePath: string;
  options?: { [key: string]: boolean | number | string; };
}

export interface RemoteFile {
  name: string;
  isDirectory: boolean;
  size: number;
  modified: string;
}

export interface ListFilesResponse {
  files: RemoteFile[];
  destination: string;
  remotePath: string;
  listTime: string;
}

export interface ServicesPage {
  services: FileTransferService[];
}

export interface SubscribeTransfersRequest {
  instance: string;
  serviceName: string;
}

export type TransferSubscription = WebSocketCall<SubscribeTransfersRequest, Transfer>;
export type RemoteFileListSubscription = WebSocketCall<SubscribeTransfersRequest, ListFilesResponse>;
