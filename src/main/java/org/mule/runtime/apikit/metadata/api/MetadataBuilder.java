/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.apikit.metadata.api;

import org.mule.runtime.config.internal.model.ApplicationModel;

public interface MetadataBuilder {

  MetadataBuilder withResourceLoader(final ResourceLoader resourceLoader);

  MetadataBuilder withApplicationModel(final ApplicationModel applicationModel);

  MetadataBuilder withNotifier(final Notifier notifier);

  Metadata build();

}
