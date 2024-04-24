package com.franklinti.sbkafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PagamentoRequestConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(PagamentoRequestConsumer.class);
    @KafkaListener(
            topics = "${pagamento.request.topic}",
            groupId = "pagamentos-request-consumer"
    )
    public void consume(String message){
        LOG.info("mensagem='{}'",message);
        System.out.println("=== Mensagem Recebida ==="+message);
    }

}
