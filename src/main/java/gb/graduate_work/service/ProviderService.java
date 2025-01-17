package gb.graduate_work.service;

import gb.graduate_work.aspects.TrackUserAction;
import gb.graduate_work.domen.Provider;
import gb.graduate_work.repository.ProviderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// класс, работающий с данными провайдеров.
    @Service
    @AllArgsConstructor
    public class ProviderService {

        private final ProviderRepository providerRepository;

        @TrackUserAction
        public List<Provider> findAllProviders() {
            return providerRepository.findAll();
        }
        @TrackUserAction
        public Provider getOne(int id) { return providerRepository.getOne(id); }
        @TrackUserAction
        public void addProvider(Provider provider) {
            providerRepository.save(provider);
        }
        @TrackUserAction
        public void deleteProviderById(int id) { providerRepository.deleteById(id); }
        @TrackUserAction
        public Provider updateProvider(Provider provider) { return providerRepository.update(provider); }
    }


