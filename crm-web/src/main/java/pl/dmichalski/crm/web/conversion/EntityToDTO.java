package pl.dmichalski.crm.web.conversion;


import java.util.Collection;
import java.util.stream.Collectors;

public interface EntityToDTO<ENTITY, DTO> {
    DTO convert(ENTITY entity);

    default Collection<DTO> convertAll(Collection<ENTITY> entities) {
        return entities.stream().map(this::convert).collect(Collectors.toList());
    }
}
