/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fusesource.gateway.handlers.detecting.protocol.openwire.codec.v1;

import org.fusesource.hawtbuf.DataByteArrayInputStream;
import org.fusesource.hawtbuf.DataByteArrayOutputStream;
import java.io.IOException;

import org.fusesource.gateway.handlers.detecting.protocol.openwire.codec.*;
import org.fusesource.gateway.handlers.detecting.protocol.openwire.command.*;



/**
 * Marshalling code for Open Wire Format for WireFormatInfoMarshaller
 *
 *
 * NOTE!: This file is auto generated - do not modify!
 *        Modify the 'apollo-openwire-generator' module instead.
 *
 */
public class WireFormatInfoMarshaller extends BaseDataStreamMarshaller {

    /**
     * Return the type of Data Structure we marshal
     * @return short representation of the type data structure
     */
    public byte getDataStructureType() {
        return WireFormatInfo.DATA_STRUCTURE_TYPE;
    }
    
    /**
     * @return a new object instance
     */
    public DataStructure createObject() {
        return new WireFormatInfo();
    }

    /**
     * Un-marshal an object instance from the data input stream
     *
     * @param o the object to un-marshal
     * @param dataIn the data input stream to build the object from
     * @throws IOException
     */
    public void tightUnmarshal(OpenWireFormat wireFormat, Object o, DataByteArrayInputStream dataIn, BooleanStream bs) throws IOException {
        super.tightUnmarshal(wireFormat, o, dataIn, bs);

        WireFormatInfo info = (WireFormatInfo)o;

        info.beforeUnmarshall(wireFormat);
        
        info.setMagic(tightUnmarshalConstByteArray(dataIn, bs, 8));
        info.setVersion(dataIn.readInt());
        info.setMarshalledProperties(tightUnmarshalBuffer(dataIn, bs));

        info.afterUnmarshall(wireFormat);

    }


    /**
     * Write the booleans that this object uses to a BooleanStream
     */
    public int tightMarshal1(OpenWireFormat wireFormat, Object o, BooleanStream bs) throws IOException {

        WireFormatInfo info = (WireFormatInfo)o;

        info.beforeMarshall(wireFormat);

        int rc = super.tightMarshal1(wireFormat, o, bs);
        rc += tightMarshalConstByteArray1(info.getMagic(), bs, 8);
        rc += tightMarshalBuffer1(info.getMarshalledProperties(), bs);

        return rc + 4;
    }

    /**
     * Write a object instance to data output stream
     *
     * @param o the instance to be marshaled
     * @param dataOut the output stream
     * @throws IOException thrown if an error occurs
     */
    public void tightMarshal2(OpenWireFormat wireFormat, Object o, DataByteArrayOutputStream dataOut, BooleanStream bs) throws IOException {
        super.tightMarshal2(wireFormat, o, dataOut, bs);

        WireFormatInfo info = (WireFormatInfo)o;
        tightMarshalConstByteArray2(info.getMagic(), dataOut, bs, 8);
        dataOut.writeInt(info.getVersion());
        tightMarshalBuffer2(info.getMarshalledProperties(), dataOut, bs);

        info.afterMarshall(wireFormat);

    }

    /**
     * Un-marshal an object instance from the data input stream
     *
     * @param o the object to un-marshal
     * @param dataIn the data input stream to build the object from
     * @throws IOException
     */
    public void looseUnmarshal(OpenWireFormat wireFormat, Object o, DataByteArrayInputStream dataIn) throws IOException {
        super.looseUnmarshal(wireFormat, o, dataIn);

        WireFormatInfo info = (WireFormatInfo)o;

        info.beforeUnmarshall(wireFormat);
        
        info.setMagic(looseUnmarshalConstByteArray(dataIn, 8));
        info.setVersion(dataIn.readInt());
        info.setMarshalledProperties(looseUnmarshalBuffer(dataIn));

        info.afterUnmarshall(wireFormat);

    }


    /**
     * Write the booleans that this object uses to a BooleanStream
     */
    public void looseMarshal(OpenWireFormat wireFormat, Object o, DataByteArrayOutputStream dataOut) throws IOException {

        WireFormatInfo info = (WireFormatInfo)o;

        info.beforeMarshall(wireFormat);

        super.looseMarshal(wireFormat, o, dataOut);
        looseMarshalConstByteArray(wireFormat, info.getMagic(), dataOut, 8);
        dataOut.writeInt(info.getVersion());
        looseMarshalBuffer(wireFormat, info.getMarshalledProperties(), dataOut);

    }
}