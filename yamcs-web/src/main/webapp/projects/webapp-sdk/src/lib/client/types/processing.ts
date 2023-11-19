import { WebSocketCall } from '../WebSocketCall';
import { Event } from './events';
import { AlgorithmStatus, Container, NamedObjectId, Parameter } from './mdb';
import { ParameterValue, Value } from './monitoring';
import { Service, ServiceState } from './system';

export interface SubscribeTMStatisticsRequest {
  instance: string;
  processor: string;
}

export interface SubscribeAlgorithmStatusRequest {
  instance: string;
  processor: string;
  name: string;
}

export interface Statistics {
  instance: string;
  processor: string;
  tmstats: TmStatistics[];
  lastUpdated: string;
}

export interface ExtractPacketResponse {
  parameterValues: ExtractedParameter[];
  events: Event[];
}

export interface ExtractedParameter {
  parameter: Parameter;
  entryContainer: Container;
  location: number;
  size: number;
  rawValue: Value;
  engValue: Value;
}

export interface TmStatistics {
  packetName: string;
  receivedPackets: number;
  packetRate: number;
  dataRate: number;
  lastReceived: string;
  lastPacketTime: string;
  subscribedParameterCount: number;
}

export interface PacketNamesResponse {
  packets: string[];
  links: string[];
}

export interface SubscribeParametersRequest {
  instance: string;
  processor: string;
  id: NamedObjectId[];
  abortOnInvalid: boolean;
  updateOnExpiration: boolean;
  sendFromCache: boolean;
  maxBytes?: number;
  action: 'REPLACE' | 'ADD' | 'REMOVE';
}

export interface SubscribeParametersData {
  mapping: { [key: number]: NamedObjectId; };
  invalid: NamedObjectId[];
  values: ParameterValue[];
}

export interface SubscribeProcessorsRequest {
  instance?: string;
  processor?: string;
}

export interface Processor {
  instance: string;
  name: string;
  type: string;
  creator: string;
  hasAlarms: boolean;
  hasCommanding: boolean;
  checkCommandClearance: boolean;
  state: ServiceState;
  persistent: boolean;
  time: string;
  replay: boolean;
  replayRequest?: ReplayRequest;
  services: Service[];
  acknowledgments: AcknowledgmentInfo[];
}

export interface AcknowledgmentInfo {
  name: string;
  description?: string;
}

export interface ReplayRequest {
  start: string;
  stop: string;
  speed: ReplaySpeed;
  endAction: string;
}

export interface ReplaySpeed {
  type: 'AFAP' | 'FIXED_DELAY' | 'REALTIME';
  param: number;
}

export type TMStatisticsSubscription = WebSocketCall<SubscribeTMStatisticsRequest, Statistics>;

export type AlgorithmStatusSubscription = WebSocketCall<SubscribeAlgorithmStatusRequest, AlgorithmStatus>;

export type ParameterSubscription = WebSocketCall<SubscribeParametersRequest, SubscribeParametersData>;

export type ProcessorSubscription = WebSocketCall<SubscribeProcessorsRequest, Processor>;
