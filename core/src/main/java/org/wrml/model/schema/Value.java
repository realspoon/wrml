/**
 * WRML - Web Resource Modeling Language
 *  __     __   ______   __    __   __
 * /\ \  _ \ \ /\  == \ /\ "-./  \ /\ \
 * \ \ \/ ".\ \\ \  __< \ \ \-./\ \\ \ \____
 *  \ \__/".~\_\\ \_\ \_\\ \_\ \ \_\\ \_____\
 *   \/_/   \/_/ \/_/ /_/ \/_/  \/_/ \/_____/
 *
 * http://www.wrml.org
 *
 * Copyright (C) 2011 - 2013 Mark Masse <mark@wrml.org> (OSS project WRML.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wrml.model.schema;

import org.wrml.model.Abstract;
import org.wrml.model.Model;

/**
 * <p>
 * {@link Value}s are embedded within {@link Schema} to convey the nature of the values within the {@link Schema}'s
 * named {@link Slot}s.
 * </p>
 */
public interface Value extends Abstract
{

    /**
     * The WRML constant name for a Value's <i>default</i> slot.
     */
    public static final String SLOT_NAME_DEFAULT = "default";
    /**
     * The WRML constant name for a Value's <i>disallowedValues</i> slot.
     */
    public static final String SLOT_NAME_DISALLOWED_VALUES = "disallowedValues";

}