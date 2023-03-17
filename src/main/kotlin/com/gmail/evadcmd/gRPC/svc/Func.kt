package com.gmail.evadcmd.gRPC.svc

import com.example.grpc.proto.Example
import com.example.grpc.proto.FuncGrpc
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class Func: FuncGrpc.FuncImplBase() {
    override fun simple(request: Example.Param?, responseObserver: StreamObserver<Example.Res>?) {
        super.simple(request, responseObserver)
    }

    override fun streamReq(responseObserver: StreamObserver<Example.Res>?): StreamObserver<Example.Param> {
        return super.streamReq(responseObserver)
    }

    override fun streamResp(request: Example.Param?, responseObserver: StreamObserver<Example.Res>?) {
        super.streamResp(request, responseObserver)
    }

    override fun biStream(responseObserver: StreamObserver<Example.Res>?): StreamObserver<Example.Param> {
        return super.biStream(responseObserver)
    }
}