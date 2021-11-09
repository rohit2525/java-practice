package com.example.extra;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by nmarsal on 29/04/2015.
 */
public final class Identifier {
    public static Identifier BAD = new Identifier("BAD", null);

    String resource;
    String id;



    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        if (StringUtils.isEmpty(resource)){
            throw new IllegalArgumentException("Parameter resource can not be empty.");
        }
        if (resource.endsWith(":")){
            throw new IllegalArgumentException("Parameter resource can not end with a ':'.");
        }
        this.resource = resource;
    }

    public String getIdAsString() {
        return id;
    }

    public Long getIdAsLong() {
        return Long.parseLong(id);
    }

    public void setId(String id) {
        if (!"BAD".equals(this.resource)){
            if (StringUtils.isEmpty(id)){
                throw new IllegalArgumentException("Parameter id can not be empty.");
            }
            if (id.startsWith(":")){
                throw new IllegalArgumentException("Parameter id can not start with a ':'.");
            }
        }
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(resource.replaceAll(":","::"));
        if (!"BAD".equals(this.resource)){
            builder.append(":");
            builder.append(id.replaceAll(":","::"));
        }
        return builder.toString();
    }

    public Identifier(String resource, String id) {
        this.setResource(resource);
        this.setId(id);
    }

    public Identifier(String value) {
        String[] values = value.split("(?<!:):(?!:)");
        if (values.length != 2){
            throw new IllegalArgumentException("value " + value + " is not correct.");
        }
        resource = values[0].replaceAll("::",":");
        id = values[1].replaceAll("::",":");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Identifier that = (Identifier) o;

        if (!resource.equals(that.resource))
            return false;
        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        int result = resource.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
