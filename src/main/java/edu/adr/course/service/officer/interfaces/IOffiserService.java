package edu.adr.course.service.officer.interfaces;

import edu.adr.course.model.Officers;

import java.util.List;
import java.util.Spliterator;

/**
 * Created by IntelliJ IDEA.
 * course.IOffiserService
 *
 * @Autor: Andrey
 * @DateTime: 24.03.2021|13:35
 * @Version: IOffiserService: 1.0
 */
public interface IOffiserService {

    Officers getById(String id);
    Officers create(Officers officers);
    Officers update(Officers officers);
    Officers delete(String id);
    List<Officers> getAll();

}
