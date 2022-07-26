package com.nttdata.bootcamp.service.impl;

import com.nttdata.bootcamp.model.Transferer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransfererServiceImpl {

    Flux<Transferer> getAllTransferer();

    Mono<Transferer> getByIdTransferer(String id);

    Mono<Transferer> createTransferer(Transferer transferer);

    Mono<Transferer> updateTransferer(String id, Transferer transferer);

    Mono<Void> deleteTransferer(String id);

}
