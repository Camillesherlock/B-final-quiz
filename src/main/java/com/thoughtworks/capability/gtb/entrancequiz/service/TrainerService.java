package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Trainer;
import com.thoughtworks.capability.gtb.entrancequiz.repository.TrainerRepository;

import java.util.List;

public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public Trainer addTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public List<Trainer> findTrainerByGrouped(Boolean grouped) {
        return trainerRepository.findAllByGrouped(grouped);
    }
}