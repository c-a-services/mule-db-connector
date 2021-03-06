/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.db.internal.domain.metadata;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;

/**
 * Resolves output metadata for a specific SQL query executed with the Query Single operation.
 *
 * @since 1.9.0
 */
public class QuerySingleMetadataResolver extends SelectMetadataResolver {

  @Override
  public String getCategoryName() {
    return "DbCategory";
  }

  @Override
  public String getResolverName() {
    return "QuerySingleResolver";
  }

  @Override
  public MetadataType getOutputType(MetadataContext context, String query)
      throws MetadataResolvingException, ConnectionException {
    return super.getOutputType(context, query);
  }
}
