package pe.edu.savbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.savbackend.domain.Curso;

public interface CursoDao extends JpaRepository<Curso,Integer>{

}
