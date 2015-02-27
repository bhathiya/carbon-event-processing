/*
*  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.event.receiver.core.config;


public class InputEventAdaptorConfiguration {

    private String inputEventAdaptorName;
    private String inputEventAdaptorType;
    private InternalInputEventAdaptorConfiguration internalInputEventAdaptorConfiguration = new InternalInputEventAdaptorConfiguration();

    public InternalInputEventAdaptorConfiguration getInternalInputEventAdaptorConfiguration() {
        return internalInputEventAdaptorConfiguration;
    }

    public void setInternalInputEventAdaptorConfiguration(
            InternalInputEventAdaptorConfiguration EventInputAdaptorMessageConfiguration) {
        this.internalInputEventAdaptorConfiguration = EventInputAdaptorMessageConfiguration;
    }

    public String getInputEventAdaptorType() {
        return inputEventAdaptorType;
    }

    public void setInputEventAdaptorType(String inputEventAdaptorType) {
        this.inputEventAdaptorType = inputEventAdaptorType;
    }

    public String getInputEventAdaptorName() {
        return inputEventAdaptorName;
    }

    public void setInputEventAdaptorName(String inputEventAdaptorName) {
        this.inputEventAdaptorName = inputEventAdaptorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InputEventAdaptorConfiguration)) {
            return false;
        }

        InputEventAdaptorConfiguration that = (InputEventAdaptorConfiguration) o;

        if (internalInputEventAdaptorConfiguration != null ? !internalInputEventAdaptorConfiguration.equals(that.internalInputEventAdaptorConfiguration) : that.getInternalInputEventAdaptorConfiguration() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return  (internalInputEventAdaptorConfiguration != null ? internalInputEventAdaptorConfiguration.hashCode() : 0);
    }

}
