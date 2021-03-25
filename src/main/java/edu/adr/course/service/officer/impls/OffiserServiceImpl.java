package edu.adr.course.service.officer.impls;

import edu.adr.course.dao.officer.impls.OfficerDAOImpl;
import edu.adr.course.model.Officers;
import edu.adr.course.model.OfficersRanks;
import edu.adr.course.service.officer.interfaces.IOffiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * course.OffiserServiceImpl
 *
 * @Autor: Andrey
 * @DateTime: 8.03.2021|13:46
 * @Version: OffiserServiceImpl: 1.0
 */


@Service
public class OffiserServiceImpl implements IOffiserService {


    @Autowired
    OfficerDAOImpl dao;

    @Override
    public Officers getById(String id) {
        return dao.getById(id);
    }

    @Override
    public Officers create(Officers officers) {
        return dao.create(officers);
    }

    @Override
    public Officers update(Officers officers) {
        return dao.update(officers);
    }

    @Override
    public Officers delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Officers> getAll() { return dao.getAll(); }
}
    