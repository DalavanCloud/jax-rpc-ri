/*
 * $Id: LiteralSimpleType.java,v 1.2 2006-04-13 01:29:55 ofung Exp $
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

package com.sun.xml.rpc.processor.model.literal;

import javax.xml.namespace.QName;

import com.sun.xml.rpc.processor.model.java.JavaSimpleType;

/**
 *
 * @author JAX-RPC Development Team
 */
public class LiteralSimpleType extends LiteralType {
    
    public LiteralSimpleType() {}
    
    public LiteralSimpleType(QName name) {
        this(name, null);
    }
    
    public LiteralSimpleType(QName name, JavaSimpleType javaType) {
        super(name, javaType);
    }
    
    public LiteralSimpleType(QName name, JavaSimpleType javaType,
        boolean nillable) {
            
        super(name, javaType);
        setNillable(nillable);
    }
    
    public void accept(LiteralTypeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
    
}