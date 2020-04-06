package by.bobruisk.homework.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bobruisk.homework.model.SparePart;

public interface ISparePartJdbcDAO extends JpaRepository<SparePart, Long> {

}
