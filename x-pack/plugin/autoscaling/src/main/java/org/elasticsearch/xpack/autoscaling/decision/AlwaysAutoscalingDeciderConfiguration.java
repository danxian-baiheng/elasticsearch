/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.autoscaling.decision;

import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;
import org.elasticsearch.common.xcontent.ObjectParser;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentParser;

import java.io.IOException;

public class AlwaysAutoscalingDeciderConfiguration implements AutoscalingDeciderConfiguration {

    public static final String NAME = "always";

    private static final ObjectParser<AlwaysAutoscalingDeciderConfiguration, Void> PARSER = new ObjectParser<>(
        NAME,
        AlwaysAutoscalingDeciderConfiguration::new
    );

    public static AlwaysAutoscalingDeciderConfiguration parse(final XContentParser parser) {
        return PARSER.apply(parser, null);
    }

    public AlwaysAutoscalingDeciderConfiguration() {}

    @SuppressWarnings("unused")
    public AlwaysAutoscalingDeciderConfiguration(final StreamInput in) {

    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String getWriteableName() {
        return NAME;
    }

    @Override
    public void writeTo(final StreamOutput out) {

    }

    @Override
    public XContentBuilder toXContent(final XContentBuilder builder, final Params params) throws IOException {
        builder.startObject();
        {}
        builder.endObject();
        return builder;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
