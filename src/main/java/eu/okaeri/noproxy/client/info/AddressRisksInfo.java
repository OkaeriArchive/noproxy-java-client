/*
 * OK! No.Proxy Java Client
 * Copyright (C) 2020 Okaeri
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package eu.okaeri.noproxy.client.info;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class AddressRisksInfo {

    private final int total;
    private final boolean proxy;
    private final boolean country;
    private final boolean asn;
    private final boolean provider;

    @JsonCreator
    public AddressRisksInfo(@JsonProperty("total") int total,
                            @JsonProperty("proxy") boolean proxy,
                            @JsonProperty("country") boolean country,
                            @JsonProperty("asn") boolean asn,
                            @JsonProperty("provider") boolean provider) {
        this.total = total;
        this.proxy = proxy;
        this.country = country;
        this.asn = asn;
        this.provider = provider;
    }

    @JsonProperty("total")
    public int getTotal() {
        return this.total;
    }

    @JsonProperty("proxy")
    public boolean isProxy() {
        return this.proxy;
    }

    @JsonProperty("country")
    public boolean isCountry() {
        return this.country;
    }

    @JsonProperty("asn")
    public boolean isAsn() {
        return this.asn;
    }

    @JsonProperty("provider")
    public boolean isProvider() {
        return this.provider;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AddressRisksInfo.class.getSimpleName() + "[", "]")
                .add("total=" + this.total)
                .add("proxy=" + this.proxy)
                .add("country=" + this.country)
                .add("asn=" + this.asn)
                .add("provider=" + this.provider)
                .toString();
    }
}
