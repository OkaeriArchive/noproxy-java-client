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

public class AddressScoreInfo {

    private final int noproxy;
    private final int abuseipdb;

    @JsonCreator
    public AddressScoreInfo(@JsonProperty("noproxy") int noproxy,
                            @JsonProperty("abuseipdb") int abuseipdb) {
        this.noproxy = noproxy;
        this.abuseipdb = abuseipdb;
    }

    @JsonProperty("noproxy")
    public int getNoproxy() {
        return this.noproxy;
    }

    @JsonProperty("abuseipdb")
    public int getAbuseipdb() {
        return this.abuseipdb;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AddressScoreInfo.class.getSimpleName() + "[", "]")
                .add("noproxy=" + this.noproxy)
                .add("abuseipdb=" + this.abuseipdb)
                .toString();
    }
}
