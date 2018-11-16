/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.apikit.metadata.api;

import java.util.Optional;
import org.mule.metadata.api.model.FunctionType;

public interface Metadata {

  /**
  * Gets the metadata for a Flow
  * @param flowName Name of the flow
  * @return The Metadata
  */
  public Optional<FunctionType> getMetadataForFlow(final String flowName);

}
