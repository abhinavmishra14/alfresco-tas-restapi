/*-
 * #%L
 * alfresco-tas-restapi
 * %%
 * Copyright (C) 2005 - 2022 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software. 
 * If the software was purchased under a paid Alfresco license, the terms of 
 * the paid license agreement will prevail.  Otherwise, the software is 
 * provided under the following open source license terms:
 * 
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.rest.model;

import java.util.List;
import java.util.Objects;

import org.alfresco.rest.core.IRestModel;
import org.alfresco.rest.core.assertion.ModelAssertion;
import org.alfresco.utility.model.TestModel;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Generated by 'Kristian.Dimitrov@hyland.com' on '2022-07-13 15:53' from 'Alfresco Content Services REST API' swagger file 
 * Generated from 'Alfresco Content Services REST API' swagger file
 * Base Path {@linkplain /alfresco/api/-default-/public/alfresco/versions/1}
 */
public class RestCompositeConditionDefinitionModel extends TestModel implements IRestModel<RestCompositeConditionDefinitionModel>
{
    @Override
    public ModelAssertion<RestCompositeConditionDefinitionModel> assertThat()
    {
        return new ModelAssertion<RestCompositeConditionDefinitionModel>(this);
    }

    @Override
    public ModelAssertion<RestCompositeConditionDefinitionModel> and()
    {
        return assertThat();
    }

    @JsonProperty(value = "entry")
    RestCompositeConditionDefinitionModel model;

    @Override
    public RestCompositeConditionDefinitionModel onModel()
    {
        return model;
    }

    /**
    Whether to invert the logic for this condition (if true then "not" is applied to the whole condition)
    */	        

    private boolean inverted;	    
    /**
    How to combine the clauses of this condition ("and" or "or")
    */	        

    private String booleanMode;	    
    /**
    Nested list of composite clauses in this condition
    */	        

    private List<RestCompositeConditionDefinitionModel> compositeConditions;	    
    /**
    Nested list of simple (per field) conditions.
    */	        

    private List<RestSimpleConditionDefinitionModel> simpleConditions;	    

    public boolean getInverted()
    {
        return this.inverted;
    }

    public void setInverted(boolean inverted)
    {
        this.inverted = inverted;
    }				

    public String getBooleanMode()
    {
        return this.booleanMode;
    }

    public void setBooleanMode(String booleanMode)
    {
        this.booleanMode = booleanMode;
    }				

    public List<RestCompositeConditionDefinitionModel> getCompositeConditions()
    {
        return this.compositeConditions;
    }

    public void setCompositeConditions(List<RestCompositeConditionDefinitionModel> compositeConditions)
    {
        this.compositeConditions = compositeConditions;
    }				

    public List<RestSimpleConditionDefinitionModel> getSimpleConditions()
    {
        return this.simpleConditions;
    }

    public void setSimpleConditions(List<RestSimpleConditionDefinitionModel> simpleConditions)
    {
        this.simpleConditions = simpleConditions;
    }

    @Override
    public String toString()
    {
        return "RestCompositeConditionDefinitionModel{" + "inverted=" + inverted + ", booleanMode='" + booleanMode + '\'' + ", compositeConditions=" + compositeConditions
            + ", simpleConditions=" + simpleConditions + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RestCompositeConditionDefinitionModel that = (RestCompositeConditionDefinitionModel) o;
        return inverted == that.inverted && Objects.equals(booleanMode, that.booleanMode) && Objects.equals(compositeConditions, that.compositeConditions) && Objects.equals(
            simpleConditions, that.simpleConditions);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(inverted, booleanMode, compositeConditions, simpleConditions);
    }
}
 
