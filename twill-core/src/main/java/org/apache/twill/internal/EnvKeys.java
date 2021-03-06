/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.twill.internal;

/**
 * Places for define common environment keys.
 */
public final class EnvKeys {

  public static final String TWILL_ZK_CONNECT = "TWILL_ZK_CONNECT";
  public static final String TWILL_APP_RUN_ID = "TWILL_APP_RUN_ID";
  public static final String TWILL_RUN_ID = "TWILL_RUN_ID";
  public static final String TWILL_INSTANCE_ID = "TWILL_INSTANCE_ID";
  public static final String TWILL_INSTANCE_COUNT = "TWILL_INSTANCE_COUNT";
  public static final String TWILL_RESERVED_MEMORY_MB = "TWILL_RESERVED_MEMORY_MB";
  public static final String TWILL_HEAP_RESERVED_MIN_RATIO = "TWILL_HEAP_RESERVED_MIN_RATIO";

  public static final String TWILL_FS_USER = "TWILL_FS_USER";

  /**
   * Cluster filesystem directory for storing twill app related files.
   */
  public static final String TWILL_APP_DIR = "TWILL_APP_DIR";

  public static final String TWILL_APP_NAME = "TWILL_APP_NAME";

  public static final String TWILL_APP_LOG_LEVEL = "TWILL_APP_LOG_LEVEL";

  public static final String TWILL_RUNNABLE_NAME = "TWILL_RUNNABLE_NAME";

  public static final String TWILL_LOG_KAFKA_ZK = "TWILL_LOG_KAFKA_ZK";

  public static final String YARN_RM_SCHEDULER_ADDRESS = "YARN_RM_SCHEDULER_ADDRESS";
  public static final String YARN_APP_ID = "YARN_APP_ID";
  public static final String YARN_APP_ID_CLUSTER_TIME = "YARN_APP_ID_CLUSTER_TIME";
  public static final String YARN_APP_ID_STR = "YARN_APP_ID_STR";

  public static final String YARN_CONTAINER_ID = "YARN_CONTAINER_ID";
  public static final String YARN_CONTAINER_HOST = "YARN_CONTAINER_HOST";
  public static final String YARN_CONTAINER_PORT = "YARN_CONTAINER_PORT";
  /**
   * Used to inform runnables of their resource usage.
   */
  public static final String YARN_CONTAINER_VIRTUAL_CORES = "YARN_CONTAINER_VIRTUAL_CORES";
  public static final String YARN_CONTAINER_MEMORY_MB = "YARN_CONTAINER_MEMORY_MB";

  private EnvKeys() {
  }
}
