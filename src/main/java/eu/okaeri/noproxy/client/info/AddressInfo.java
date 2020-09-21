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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.okaeri.noproxy.client.NoProxyApiContext;
import eu.okaeri.noproxy.client.ApiException;
import eu.okaeri.noproxy.client.ApiResource;

import java.util.StringJoiner;

public class AddressInfo {

    private final AddressGeneralInfo general;
    private final AddressRisksInfo risks;
    private final AddressScoreInfo score;
    private final AddressSuggestionsInfo suggestions;

    @JsonCreator
    public AddressInfo(@JsonProperty("general") AddressGeneralInfo general,
                       @JsonProperty("risks") AddressRisksInfo risks,
                       @JsonProperty("score") AddressScoreInfo score,
                       @JsonProperty("suggestions") AddressSuggestionsInfo suggestions) {
        this.general = general;
        this.risks = risks;
        this.score = score;
        this.suggestions = suggestions;
    }

    @JsonProperty("general")
    public AddressGeneralInfo getGeneral() {
        return this.general;
    }

    @JsonProperty("risks")
    public AddressRisksInfo getRisks() {
        return this.risks;
    }

    @JsonProperty("score")
    public AddressScoreInfo getScore() {
        return this.score;
    }

    @JsonProperty("suggestions")
    public AddressSuggestionsInfo getSuggestions() {
        return this.suggestions;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AddressInfo.class.getSimpleName() + "[", "]")
                .add("general=" + this.general)
                .add("risks=" + this.risks)
                .add("score=" + this.score)
                .add("suggestions=" + this.suggestions)
                .toString();
    }

    @JsonIgnore
    public static AddressInfo get(NoProxyApiContext apiContext, String address) throws ApiException {
        return ApiResource.get(apiContext, "/v1/" + address, AddressInfo.class);
    }
}
