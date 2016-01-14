/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.transport.http;

import java.net.URI;

import org.apache.mina.core.service.IoHandler;
import org.kaazing.gateway.transport.UpgradeFuture;

public interface HttpConnectSession extends HttpSession {

    // TODO: add helper methods for setting parameters
    
	void setRequestURI(URI requestURI);
	
    void setMethod(HttpMethod method);

    // setContentLength(int length);

    UpgradeFuture upgrade(IoHandler handler);
}
