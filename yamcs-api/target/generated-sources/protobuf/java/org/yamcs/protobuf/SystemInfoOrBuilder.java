// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yamcs/protobuf/server/server_service.proto

package org.yamcs.protobuf;

public interface SystemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yamcs.protobuf.server.SystemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Yamcs version number.
   * </pre>
   *
   * <code>optional string yamcsVersion = 1;</code>
   * @return Whether the yamcsVersion field is set.
   */
  boolean hasYamcsVersion();
  /**
   * <pre>
   * Yamcs version number.
   * </pre>
   *
   * <code>optional string yamcsVersion = 1;</code>
   * @return The yamcsVersion.
   */
  java.lang.String getYamcsVersion();
  /**
   * <pre>
   * Yamcs version number.
   * </pre>
   *
   * <code>optional string yamcsVersion = 1;</code>
   * @return The bytes for yamcsVersion.
   */
  com.google.protobuf.ByteString
      getYamcsVersionBytes();

  /**
   * <pre>
   * Git revision number at build time.
   * </pre>
   *
   * <code>optional string revision = 2;</code>
   * @return Whether the revision field is set.
   */
  boolean hasRevision();
  /**
   * <pre>
   * Git revision number at build time.
   * </pre>
   *
   * <code>optional string revision = 2;</code>
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   * <pre>
   * Git revision number at build time.
   * </pre>
   *
   * <code>optional string revision = 2;</code>
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString
      getRevisionBytes();

  /**
   * <pre>
   * Server identifier, as used in system parameters and distributed setups.
   * </pre>
   *
   * <code>optional string serverId = 3;</code>
   * @return Whether the serverId field is set.
   */
  boolean hasServerId();
  /**
   * <pre>
   * Server identifier, as used in system parameters and distributed setups.
   * </pre>
   *
   * <code>optional string serverId = 3;</code>
   * @return The serverId.
   */
  java.lang.String getServerId();
  /**
   * <pre>
   * Server identifier, as used in system parameters and distributed setups.
   * </pre>
   *
   * <code>optional string serverId = 3;</code>
   * @return The bytes for serverId.
   */
  com.google.protobuf.ByteString
      getServerIdBytes();

  /**
   * <pre>
   * Uptime of Yamcs in milliseconds 
   * </pre>
   *
   * <code>optional int64 uptime = 5;</code>
   * @return Whether the uptime field is set.
   */
  boolean hasUptime();
  /**
   * <pre>
   * Uptime of Yamcs in milliseconds 
   * </pre>
   *
   * <code>optional int64 uptime = 5;</code>
   * @return The uptime.
   */
  long getUptime();

  /**
   * <pre>
   * Java virtual machine implementation name, version and vendor
   * </pre>
   *
   * <code>optional string jvm = 6;</code>
   * @return Whether the jvm field is set.
   */
  boolean hasJvm();
  /**
   * <pre>
   * Java virtual machine implementation name, version and vendor
   * </pre>
   *
   * <code>optional string jvm = 6;</code>
   * @return The jvm.
   */
  java.lang.String getJvm();
  /**
   * <pre>
   * Java virtual machine implementation name, version and vendor
   * </pre>
   *
   * <code>optional string jvm = 6;</code>
   * @return The bytes for jvm.
   */
  com.google.protobuf.ByteString
      getJvmBytes();

  /**
   * <pre>
   * Working directory of Yamcs (base path for relative references)
   * </pre>
   *
   * <code>optional string workingDirectory = 7;</code>
   * @return Whether the workingDirectory field is set.
   */
  boolean hasWorkingDirectory();
  /**
   * <pre>
   * Working directory of Yamcs (base path for relative references)
   * </pre>
   *
   * <code>optional string workingDirectory = 7;</code>
   * @return The workingDirectory.
   */
  java.lang.String getWorkingDirectory();
  /**
   * <pre>
   * Working directory of Yamcs (base path for relative references)
   * </pre>
   *
   * <code>optional string workingDirectory = 7;</code>
   * @return The bytes for workingDirectory.
   */
  com.google.protobuf.ByteString
      getWorkingDirectoryBytes();

  /**
   * <pre>
   * Directory where configuration files are located.
   * </pre>
   *
   * <code>optional string configDirectory = 8;</code>
   * @return Whether the configDirectory field is set.
   */
  boolean hasConfigDirectory();
  /**
   * <pre>
   * Directory where configuration files are located.
   * </pre>
   *
   * <code>optional string configDirectory = 8;</code>
   * @return The configDirectory.
   */
  java.lang.String getConfigDirectory();
  /**
   * <pre>
   * Directory where configuration files are located.
   * </pre>
   *
   * <code>optional string configDirectory = 8;</code>
   * @return The bytes for configDirectory.
   */
  com.google.protobuf.ByteString
      getConfigDirectoryBytes();

  /**
   * <pre>
   * Directory where Yamcs data is stored.
   * </pre>
   *
   * <code>optional string dataDirectory = 9;</code>
   * @return Whether the dataDirectory field is set.
   */
  boolean hasDataDirectory();
  /**
   * <pre>
   * Directory where Yamcs data is stored.
   * </pre>
   *
   * <code>optional string dataDirectory = 9;</code>
   * @return The dataDirectory.
   */
  java.lang.String getDataDirectory();
  /**
   * <pre>
   * Directory where Yamcs data is stored.
   * </pre>
   *
   * <code>optional string dataDirectory = 9;</code>
   * @return The bytes for dataDirectory.
   */
  com.google.protobuf.ByteString
      getDataDirectoryBytes();

  /**
   * <pre>
   * Directory where Yamcs may cache files.
   * </pre>
   *
   * <code>optional string cacheDirectory = 10;</code>
   * @return Whether the cacheDirectory field is set.
   */
  boolean hasCacheDirectory();
  /**
   * <pre>
   * Directory where Yamcs may cache files.
   * </pre>
   *
   * <code>optional string cacheDirectory = 10;</code>
   * @return The cacheDirectory.
   */
  java.lang.String getCacheDirectory();
  /**
   * <pre>
   * Directory where Yamcs may cache files.
   * </pre>
   *
   * <code>optional string cacheDirectory = 10;</code>
   * @return The bytes for cacheDirectory.
   */
  com.google.protobuf.ByteString
      getCacheDirectoryBytes();

  /**
   * <pre>
   * Operating system name and version.
   * </pre>
   *
   * <code>optional string os = 11;</code>
   * @return Whether the os field is set.
   */
  boolean hasOs();
  /**
   * <pre>
   * Operating system name and version.
   * </pre>
   *
   * <code>optional string os = 11;</code>
   * @return The os.
   */
  java.lang.String getOs();
  /**
   * <pre>
   * Operating system name and version.
   * </pre>
   *
   * <code>optional string os = 11;</code>
   * @return The bytes for os.
   */
  com.google.protobuf.ByteString
      getOsBytes();

  /**
   * <pre>
   * Operating system architecture.
   * </pre>
   *
   * <code>optional string arch = 12;</code>
   * @return Whether the arch field is set.
   */
  boolean hasArch();
  /**
   * <pre>
   * Operating system architecture.
   * </pre>
   *
   * <code>optional string arch = 12;</code>
   * @return The arch.
   */
  java.lang.String getArch();
  /**
   * <pre>
   * Operating system architecture.
   * </pre>
   *
   * <code>optional string arch = 12;</code>
   * @return The bytes for arch.
   */
  com.google.protobuf.ByteString
      getArchBytes();

  /**
   * <pre>
   * Number of processors available to Yamcs.
   * </pre>
   *
   * <code>optional int32 availableProcessors = 13;</code>
   * @return Whether the availableProcessors field is set.
   */
  boolean hasAvailableProcessors();
  /**
   * <pre>
   * Number of processors available to Yamcs.
   * </pre>
   *
   * <code>optional int32 availableProcessors = 13;</code>
   * @return The availableProcessors.
   */
  int getAvailableProcessors();

  /**
   * <pre>
   * System load average for the last minute.
   * </pre>
   *
   * <code>optional double loadAverage = 14;</code>
   * @return Whether the loadAverage field is set.
   */
  boolean hasLoadAverage();
  /**
   * <pre>
   * System load average for the last minute.
   * </pre>
   *
   * <code>optional double loadAverage = 14;</code>
   * @return The loadAverage.
   */
  double getLoadAverage();

  /**
   * <pre>
   * Amount of memory in bytes of the heap that is used for object allocation and that is committed for the JVM to use.
   * </pre>
   *
   * <code>optional int64 heapMemory = 15;</code>
   * @return Whether the heapMemory field is set.
   */
  boolean hasHeapMemory();
  /**
   * <pre>
   * Amount of memory in bytes of the heap that is used for object allocation and that is committed for the JVM to use.
   * </pre>
   *
   * <code>optional int64 heapMemory = 15;</code>
   * @return The heapMemory.
   */
  long getHeapMemory();

  /**
   * <pre>
   * Amount of used heap memory in bytes.
   * </pre>
   *
   * <code>optional int64 usedHeapMemory = 16;</code>
   * @return Whether the usedHeapMemory field is set.
   */
  boolean hasUsedHeapMemory();
  /**
   * <pre>
   * Amount of used heap memory in bytes.
   * </pre>
   *
   * <code>optional int64 usedHeapMemory = 16;</code>
   * @return The usedHeapMemory.
   */
  long getUsedHeapMemory();

  /**
   * <pre>
   * Maximum amount of heap memory in bytes that can be used for memory management.
   * </pre>
   *
   * <code>optional int64 maxHeapMemory = 17;</code>
   * @return Whether the maxHeapMemory field is set.
   */
  boolean hasMaxHeapMemory();
  /**
   * <pre>
   * Maximum amount of heap memory in bytes that can be used for memory management.
   * </pre>
   *
   * <code>optional int64 maxHeapMemory = 17;</code>
   * @return The maxHeapMemory.
   */
  long getMaxHeapMemory();

  /**
   * <pre>
   * Amount of non-heap memory in bytes that is committed for the JVM to use.
   * </pre>
   *
   * <code>optional int64 nonHeapMemory = 18;</code>
   * @return Whether the nonHeapMemory field is set.
   */
  boolean hasNonHeapMemory();
  /**
   * <pre>
   * Amount of non-heap memory in bytes that is committed for the JVM to use.
   * </pre>
   *
   * <code>optional int64 nonHeapMemory = 18;</code>
   * @return The nonHeapMemory.
   */
  long getNonHeapMemory();

  /**
   * <pre>
   * Amount of non-heap used memory in bytes.
   * </pre>
   *
   * <code>optional int64 usedNonHeapMemory = 19;</code>
   * @return Whether the usedNonHeapMemory field is set.
   */
  boolean hasUsedNonHeapMemory();
  /**
   * <pre>
   * Amount of non-heap used memory in bytes.
   * </pre>
   *
   * <code>optional int64 usedNonHeapMemory = 19;</code>
   * @return The usedNonHeapMemory.
   */
  long getUsedNonHeapMemory();

  /**
   * <pre>
   * Maximum amount of non-heap memory in bytes that can be used for memory management.
   * </pre>
   *
   * <code>optional int64 maxNonHeapMemory = 20;</code>
   * @return Whether the maxNonHeapMemory field is set.
   */
  boolean hasMaxNonHeapMemory();
  /**
   * <pre>
   * Maximum amount of non-heap memory in bytes that can be used for memory management.
   * </pre>
   *
   * <code>optional int64 maxNonHeapMemory = 20;</code>
   * @return The maxNonHeapMemory.
   */
  long getMaxNonHeapMemory();

  /**
   * <pre>
   * Number of active threads.
   * </pre>
   *
   * <code>optional int64 jvmThreadCount = 21;</code>
   * @return Whether the jvmThreadCount field is set.
   */
  boolean hasJvmThreadCount();
  /**
   * <pre>
   * Number of active threads.
   * </pre>
   *
   * <code>optional int64 jvmThreadCount = 21;</code>
   * @return The jvmThreadCount.
   */
  long getJvmThreadCount();

  /**
   * <pre>
   * Root directories, each corresponding to a distinct file hierarchy.
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.server.RootDirectory rootDirectories = 22;</code>
   */
  java.util.List<org.yamcs.protobuf.RootDirectory> 
      getRootDirectoriesList();
  /**
   * <pre>
   * Root directories, each corresponding to a distinct file hierarchy.
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.server.RootDirectory rootDirectories = 22;</code>
   */
  org.yamcs.protobuf.RootDirectory getRootDirectories(int index);
  /**
   * <pre>
   * Root directories, each corresponding to a distinct file hierarchy.
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.server.RootDirectory rootDirectories = 22;</code>
   */
  int getRootDirectoriesCount();
  /**
   * <pre>
   * Root directories, each corresponding to a distinct file hierarchy.
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.server.RootDirectory rootDirectories = 22;</code>
   */
  java.util.List<? extends org.yamcs.protobuf.RootDirectoryOrBuilder> 
      getRootDirectoriesOrBuilderList();
  /**
   * <pre>
   * Root directories, each corresponding to a distinct file hierarchy.
   * </pre>
   *
   * <code>repeated .yamcs.protobuf.server.RootDirectory rootDirectories = 22;</code>
   */
  org.yamcs.protobuf.RootDirectoryOrBuilder getRootDirectoriesOrBuilder(
      int index);

  /**
   * <pre>
   * Information about the Yamcs process and any descendants.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.server.ProcessInfo process = 23;</code>
   * @return Whether the process field is set.
   */
  boolean hasProcess();
  /**
   * <pre>
   * Information about the Yamcs process and any descendants.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.server.ProcessInfo process = 23;</code>
   * @return The process.
   */
  org.yamcs.protobuf.ProcessInfo getProcess();
  /**
   * <pre>
   * Information about the Yamcs process and any descendants.
   * </pre>
   *
   * <code>optional .yamcs.protobuf.server.ProcessInfo process = 23;</code>
   */
  org.yamcs.protobuf.ProcessInfoOrBuilder getProcessOrBuilder();
}
