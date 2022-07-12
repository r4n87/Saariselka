package dev.saariselka.inlol.service;

import dev.saariselka.inlol.entity.QueueTypeEntity;
import dev.saariselka.inlol.repository.QueueTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueTypeService {
    @Autowired
    QueueTypeRepository queueTypeRepository;

    public List<QueueTypeEntity> findByQueueId(int queueId) {
        return queueTypeRepository.findByQueueId(queueId);
    }
}
