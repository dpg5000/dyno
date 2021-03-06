/*******************************************************************************
 * Copyright 2011 Netflix
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.netflix.dyno.connectionpool;

import java.util.List;

/**
 * Interface for a supplier of host objects that map to the dynomite cluster. The {@link ConnectionPool} object can use this to 
 * instantiate {@link Connection}s to the hosts supplied by the host supplier
 * 
 * @author poberai
 *
 */
public interface HostSupplier {
	
	/**
	 * Return a list of dynomite hosts for the connection pool
	 * @return List<Host>
	 */
	public List<Host> getHosts();
}
