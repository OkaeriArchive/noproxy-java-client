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
package eu.okaeri.noproxy.client;

import okhttp3.OkHttpClient;

public class NoProxyApiContext {

    private static final String DEFAULT_MAIN_URL = "https://noproxy-api.okaeri.eu";

    private final String token;

    private String mainUrl;
    private OkHttpClient client;

    public NoProxyApiContext(String token) {
        if (token == null) throw new IllegalArgumentException("token cannot be null");
        this.token = token;
        this.client = new OkHttpClient();
        this.mainUrl = DEFAULT_MAIN_URL;
    }

    public String getToken() {
        return this.token;
    }

    protected OkHttpClient getClient() {
        return this.client;
    }

    public String getMainUrl() {
        return this.mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }
}
