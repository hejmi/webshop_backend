package tankesmedjan.webshop.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import tankesmedjan.webshop.dto.CategoryDTO;
import tankesmedjan.webshop.models.Category;

/**
 * Mapper with MapStruct
 * https://mapstruct.org/documentation/reference-guide/
 *
 * Maps the dto:information to entities
 */

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper( CategoryMapper.class );

    @Mapping(source = "parentCategoryId", target = "parentCategoryId")
    @Mapping(source = "categoryName" , target = "categoryName")
    Category dtoToCategory (CategoryDTO categoryDTO);
}
