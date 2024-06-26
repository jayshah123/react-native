/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.modules.appregistry

import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.WritableMap

/** JS module interface - main entry point for launching React application for a given key. */
public interface AppRegistry : JavaScriptModule {

  public fun runApplication(appKey: String, appParameters: WritableMap)

  public fun unmountApplicationComponentAtRootTag(rootNodeTag: Int)

  public fun startHeadlessTask(taskId: Int, taskKey: String, data: WritableMap)
}
