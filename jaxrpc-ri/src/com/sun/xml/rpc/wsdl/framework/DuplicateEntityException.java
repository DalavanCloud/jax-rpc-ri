/*
 * $Id: DuplicateEntityException.java,v 1.2 2006-04-13 01:34:30 ofung Exp $
 */

/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License).  You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at
 * https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Copyright 2006 Sun Microsystems Inc. All Rights Reserved
 */

package com.sun.xml.rpc.wsdl.framework;

/**
 * An exception signalling that an entity with the given name/id has already been defined.
 *
 * @author JAX-RPC Development Team
 */
public class DuplicateEntityException extends ValidationException {

    public DuplicateEntityException(GloballyKnown entity) {
        super(
            "entity.duplicateWithType",
            new Object[] {
                entity.getElementName().getLocalPart(),
                entity.getName()});
    }

    public DuplicateEntityException(Identifiable entity) {
        super(
            "entity.duplicateWithType",
            new Object[] {
                entity.getElementName().getLocalPart(),
                entity.getID()});
    }

    public DuplicateEntityException(Entity entity, String name) {
        super(
            "entity.duplicateWithType",
            new Object[] { entity.getElementName().getLocalPart(), name });
    }

    public String getResourceBundleName() {
        return "com.sun.xml.rpc.resources.wsdl";
    }
}