/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.cloudkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKReference/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements CKRecordValue/*</implements>*/ {

    /*<ptr>*/public static class CKReferencePtr extends Ptr<CKReference, CKReferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKReference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKReference() {}
    protected CKReference(SkipInit skipInit) { super(skipInit); }
    public CKReference(CKRecordID recordID, CKReferenceAction action) { super((SkipInit) null); initObject(init(recordID, action)); }
    public CKReference(CKRecord record, CKReferenceAction action) { super((SkipInit) null); initObject(init(record, action)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "referenceAction")
    public native CKReferenceAction getReferenceAction();
    @Property(selector = "recordID")
    public native CKRecordID getRecordID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRecordID:action:")
    protected native @Pointer long init(CKRecordID recordID, CKReferenceAction action);
    @Method(selector = "initWithRecord:action:")
    protected native @Pointer long init(CKRecord record, CKReferenceAction action);
    /*</methods>*/
}