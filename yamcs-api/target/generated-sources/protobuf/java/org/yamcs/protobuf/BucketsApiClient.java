package org.yamcs.protobuf;

import com.google.protobuf.Empty;
import org.yamcs.api.HttpBody;
import org.yamcs.api.MethodHandler;
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
@javax.annotation.processing.Generated(value = "org.yamcs.protoc.ServiceGenerator", date = "2023-11-18T19:00:35.915509Z")
public class BucketsApiClient extends AbstractBucketsApi<Void> {

    private final MethodHandler handler;

    public BucketsApiClient(MethodHandler handler) {
        this.handler = handler;
    }

    /**
     * <pre>
     *  List buckets
     * </pre>
     */
    @Override
    public final void listBuckets(Void ctx, ListBucketsRequest request, Observer<ListBucketsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(0),
            request,
            ListBucketsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Get a bucket
     * </pre>
     */
    @Override
    public final void getBucket(Void ctx, GetBucketRequest request, Observer<BucketInfo> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(1),
            request,
            BucketInfo.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Create a bucket
     * </pre>
     */
    @Override
    public final void createBucket(Void ctx, CreateBucketRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(2),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete a bucket
     * 
     *  Deleting a bucket means also deleting all objects that are part of it.
     * </pre>
     */
    @Override
    public final void deleteBucket(Void ctx, DeleteBucketRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(3),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void getObject(Void ctx, GetObjectRequest request, Observer<HttpBody> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(4),
            request,
            HttpBody.getDefaultInstance(),
            observer);
    }

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
    @Override
    public final void uploadObject(Void ctx, UploadObjectRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(5),
            request,
            Empty.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  List objects
     * </pre>
     */
    @Override
    public final void listObjects(Void ctx, ListObjectsRequest request, Observer<ListObjectsResponse> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(6),
            request,
            ListObjectsResponse.getDefaultInstance(),
            observer);
    }

    /**
     * <pre>
     *  Delete an object
     * </pre>
     */
    @Override
    public final void deleteObject(Void ctx, DeleteObjectRequest request, Observer<Empty> observer) {
        handler.call(
            getDescriptorForType().getMethods().get(7),
            request,
            Empty.getDefaultInstance(),
            observer);
    }
}
