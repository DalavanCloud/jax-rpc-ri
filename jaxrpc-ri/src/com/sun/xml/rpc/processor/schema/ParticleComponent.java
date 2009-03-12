/*
 * $Id: ParticleComponent.java,v 1.2.2.3 2008-02-15 03:39:16 venkatajetti Exp $
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

package com.sun.xml.rpc.processor.schema;

/**
 *
 * @author JAX-RPC Development Team
 */
public class ParticleComponent extends Component {

    public static final int TERM_MODEL_GROUP = 1;
    public static final int TERM_WILDCARD = 2;
    public static final int TERM_ELEMENT = 3;

	//Nagesh(06/23/06): To support maxOccurs="unbounded" constraint in the wsdl
	private boolean run_cts;
    public ParticleComponent() {
		//Nagesh(06/23/06): To support maxOccurs="unbounded" constraint in the wsdl
		run_cts = new Boolean(System.getProperty("com.sun.jaxrpc.cts.run", "true")).booleanValue();
	}

    public int getMinOccurs() {
        return _minOccurs;
    }

    public void setMinOccurs(int i) {
        _minOccurs = i;
    }

    public int getMaxOccurs() {
        // CR-6660318, Merge from JavaCAPS RTS for backward compatibility
        if (_maxOccurs == UNBOUNDED) {
            // CR-6660365, Merge from JavaCAPS RTS for backward compatibility
            //Nagesh(06/23/06): To support maxOccurs="unbounded" constraint in the wsdl
            if(!run_cts) return 1;
            throw new IllegalStateException();
        }
        return _maxOccurs;
    }

    public void setMaxOccurs(int i) {
        _maxOccurs = i;
    }

    public boolean isMaxOccursUnbounded() {
        return _maxOccurs == UNBOUNDED;
    }

    public void setMaxOccursUnbounded() {
        _maxOccurs = UNBOUNDED;
    }

    public boolean doesNotOccur() {
        return _minOccurs == 0 && _maxOccurs == 0;
    }

    public boolean occursOnce() {
        return _minOccurs == 1 && _maxOccurs == 1;
    }

    public boolean occursAtMostOnce() {
        return _minOccurs <= 1 && _maxOccurs == 1;
    }

    public boolean occursAtLeastOnce() {
        return _minOccurs >= 1;
    }

    public boolean occursZeroOrMore() {
        return _minOccurs == 0 && _maxOccurs == UNBOUNDED;
    }

    public boolean occursOnceOrMore() {
        return _minOccurs == 1 && _maxOccurs == UNBOUNDED;
    }

    public boolean mayOccurMoreThanOnce() {
        return _maxOccurs > 1 || _maxOccurs == UNBOUNDED;
    }

    public int getTermTag() {
        return _termTag;
    }

    public void setTermTag(int i) {
        _termTag = i;
    }

    public ModelGroupComponent getModelGroupTerm() {
        return _modelGroupTerm;
    }

    public void setModelGroupTerm(ModelGroupComponent c) {
        _modelGroupTerm = c;
    }

    public ElementDeclarationComponent getElementTerm() {
        return _elementTerm;
    }

    public void setElementTerm(ElementDeclarationComponent c) {
        _elementTerm = c;
    }

    public WildcardComponent getWildcardTerm() {
        return _wildcardTerm;
    }

    public void setWildcardTerm(WildcardComponent c) {
        _wildcardTerm = c;
    }

    public void accept(ComponentVisitor visitor) throws Exception {
        visitor.visit(this);
    }

    public boolean occursZeroOrOne() {
        return _minOccurs == 0 && _maxOccurs == 1;
    }

    private int _minOccurs;
    private int _maxOccurs;
    private int _termTag;
    private ModelGroupComponent _modelGroupTerm;
    private WildcardComponent _wildcardTerm;
    private ElementDeclarationComponent _elementTerm;
	//private static final int UNBOUNDED = -1;
	//Nagesh(06/23/06): To support maxOccurs="unbounded" constraint in the wsdl
	private static final int UNBOUNDED =  System.getProperty("com.sun.jaxrpc.cts.run","true").equals("false")?1:-1;

}