/*
 * $Id: JAXRPCDeserializer.java,v 1.2 2006-04-13 01:27:11 ofung Exp $
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

package com.sun.xml.rpc.encoding;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.Deserializer;

import com.sun.xml.rpc.streaming.XMLReader;

/**
 *
 * @author JAX-RPC Development Team
 */
public interface JAXRPCDeserializer extends Deserializer {
    public Object deserialize(
        QName name,
        XMLReader element,
        SOAPDeserializationContext context);
    public Object deserialize(
        DataHandler dataHandler,
        SOAPDeserializationContext context);
}