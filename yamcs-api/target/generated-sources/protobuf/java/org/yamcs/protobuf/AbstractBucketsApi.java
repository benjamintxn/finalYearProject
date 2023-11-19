package org.yamcs.protobuf;

import com.google.protobuf.Descriptors.MethodDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import org.yamcs.api.Api;
import org.yamcs.api.HttpBody;
import org.yamcs.api.Observer;

/**
 * <pre>
 *  Methods related to object storage.
 * 
 *  Buckets represent a simple mechanism for storing user objects (binary data
 *  chunks such as images, monitoring lists, displays...) together with some
 *  metadata.
 * 
 *  The metadata is represented by simple (key,value) pairs where both key and
 *  value are strings.
 * 
 *  By default each user has a bucket named ``user.username`` which can be used
 *  without extra privileges. Additional buckets may be created and used if the
 *  user has the required privileges. The user bucket will be created
 *  automatically when the user tries to access it.
 * 
 *  The following limitations are implemented in order to prevent disk over
 *  consumption and keep the service responsive:
 * 
 *  *   The maximum size of an upload including data and metadata is 5MB.
 *  *   The maximum number of objects in one bucket is 1000.
 *  *   The maximum size of an bucket 100MB (counted as the sum of the size of
 *      the objects within the bucket).
 *  *   The maximum size of the metadata is 16KB (counted as the sum of the
 *      length of the keys and values).
 * </pre>
 */
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.899840Z")
@SuppressWarnings("unchecked")
public abstract class AbstractBucketsApi<T> implements Api<T> {

    /**
     * <pre>
     *  List buckets
     * </pre>
     */
    public abstract void listBuckets(T ctx, ListBucketsRequest request, Observer<ListBucketsResponse> observer);

    /**
     * <pre>
     *  Get a bucket
     * </pre>
     */
    public abstract void getBucket(T ctx, GetBucketRequest request, Observer<BucketInfo> observer);

    /**
     * <pre>
     *  Create a bucket
     * </pre>
     */
    public abstract void createBucket(T ctx, CreateBucketRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Delete a bucket
     * 
     *  Deleting a bucket means also deleting all objects that are part of it.
     * </pre>
     */
    public abstract void deleteBucket(T ctx, DeleteBucketRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  Get an object
     * 
     *  The body of the response represents the object data. The ``Content-Type``
     *  header is set to the content type of the object specified when uploading
     *  the object. If no ``Content-Type`` was specified when creating the object,
     *  the ``Content-Type`` of the response is set to
     *  ``application/octet-stream``.
     * </pre>
     */
    public abstract void getObject(T ctx, GetObjectRequest request, Observer<HttpBody> observer);

    /**
     * <pre>
     *  Upload an object
     * 
     *  .. rubric:: Simple upload
     *  
     *  In case of simple upload, the objectName has to be specified as part of the URL
     *  and the ``Content-Type header`` has to be set to the type of the object. The body
     *  of the request is the object data.
     *  
     *  
     *  .. rubric:: Form upload
     *  
     *  The form based upload can be used to upload an object from an HTML form. In this
     *  case the Content-Type of the request is set to ``multipart/form-data``, and the
     *  body will contain at least one part which is the object data. This part includes
     *  a filename which is used as the object name as well as a ``Content-Type`` header.
     *  The name attribute for the file part is ignored.
     *  Additional parts (which do not specify a filename) will be used as metadata: the
     *  name is specified as part of the ``Content-Disposition`` and the value is the body
     *  of the part.
     *  
     *  This can be tested with curl using the ``-F`` option.
     *  
     *  
     *  .. rubric:: Example
     *  .. code-block:: http
     *  
     *      POST /api/buckets/_global/my_bucket HTTP/1.1
     *      Host: localhost:8090
     *      User-Agent: curl/7.58.0
     *      Accept: *{@literal /}*
     *      Content-Length: 1090
     *      Content-Type: multipart/form-data; boundary=------------------------7109c709802f7ae4
     *  
     *      --------------------------7109c709802f7ae4
     *      Content-Disposition: form-data; name="file"; filename="object/name"
     *      Content-Type: text/plain
     *  
     *      [object data]
     *      --------------------------7109c709802f7ae4
     *      Content-Disposition: form-data; name="name1"
     *  
     *      value1
     *      --------------------------7109c709802f7ae4
     *      Content-Disposition: form-data; name="name2"
     *  
     *      value2
     *      --------------------------7109c709802f7ae4--
     *  
     *  
     *  This will create an object named ``object/name`` with two metadata properties:
     *  
     *  .. code-block:: json
     *  
     *      {
     *          "name1": "value1",
     *          "name2": "value2"
     *      }
     * </pre>
     */
    public abstract void uploadObject(T ctx, UploadObjectRequest request, Observer<Empty> observer);

    /**
     * <pre>
     *  List objects
     * </pre>
     */
    public abstract void listObjects(T ctx, ListObjectsRequest request, Observer<ListObjectsResponse> observer);

    /**
     * <pre>
     *  Delete an object
     * </pre>
     */
    public abstract void deleteObject(T ctx, DeleteObjectRequest request, Observer<Empty> observer);

    @Override
    public final ServiceDescriptor getDescriptorForType() {
        return BucketsProto.getDescriptor().getServices().get(0);
    }

    @Override
    public final Message getRequestPrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListBucketsRequest.getDefaultInstance();
        case 1:
            return GetBucketRequest.getDefaultInstance();
        case 2:
            return CreateBucketRequest.getDefaultInstance();
        case 3:
            return DeleteBucketRequest.getDefaultInstance();
        case 4:
            return GetObjectRequest.getDefaultInstance();
        case 5:
            return UploadObjectRequest.getDefaultInstance();
        case 6:
            return ListObjectsRequest.getDefaultInstance();
        case 7:
            return DeleteObjectRequest.getDefaultInstance();
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final Message getResponsePrototype(MethodDescriptor method) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            return ListBucketsResponse.getDefaultInstance();
        case 1:
            return BucketInfo.getDefaultInstance();
        case 2:
            return Empty.getDefaultInstance();
        case 3:
            return Empty.getDefaultInstance();
        case 4:
            return HttpBody.getDefaultInstance();
        case 5:
            return Empty.getDefaultInstance();
        case 6:
            return ListObjectsResponse.getDefaultInstance();
        case 7:
            return Empty.getDefaultInstance();
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final void callMethod(MethodDescriptor method, T ctx, Message request, Observer<Message> future) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        case 0:
            listBuckets(ctx, (ListBucketsRequest) request, (Observer<ListBucketsResponse>)(Object) future);
            return;
        case 1:
            getBucket(ctx, (GetBucketRequest) request, (Observer<BucketInfo>)(Object) future);
            return;
        case 2:
            createBucket(ctx, (CreateBucketRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 3:
            deleteBucket(ctx, (DeleteBucketRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 4:
            getObject(ctx, (GetObjectRequest) request, (Observer<HttpBody>)(Object) future);
            return;
        case 5:
            uploadObject(ctx, (UploadObjectRequest) request, (Observer<Empty>)(Object) future);
            return;
        case 6:
            listObjects(ctx, (ListObjectsRequest) request, (Observer<ListObjectsResponse>)(Object) future);
            return;
        case 7:
            deleteObject(ctx, (DeleteObjectRequest) request, (Observer<Empty>)(Object) future);
            return;
        default:
            throw new IllegalStateException();
        }
    }

    @Override
    public final Observer<Message> callMethod(MethodDescriptor method, T ctx, Observer<Message> future) {
        if (method.getService() != getDescriptorForType()) {
            throw new IllegalArgumentException("Method not contained by this service.");
        }
        switch (method.getIndex()) {
        default:
            throw new IllegalStateException();
        }
    }
}
