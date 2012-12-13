/*
 * � Copyright IBM Corp. 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package com.ibm.sbt.services.client.smartcloud.profiles;
/**
 * @author Vimal Dhupar
 */
public enum ProfilesAPIMap {
        GETPROFILE("/lotuslive-shindig-server/social/rest/people/@me/@self"),
        GETUSERIDENTITY("/manage/oauth/getUserIdentity");

        private final String url;
        
        ProfilesAPIMap(String url)
        {
            this.url = url;
        }
        public String getUrl()
        {
            return url;
        }
        @Override
        public String toString()
        {
            return this.url;
        }
}