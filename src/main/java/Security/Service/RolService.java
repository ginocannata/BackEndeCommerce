/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Security.Service;

import Security.Entity.Rol;
import Security.Enums.RolNombre;
import Security.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ginoc
 */
@Service
@Transactional
public class RolService {
        @Autowired
    RolRepository irolRepository;
         public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }        
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
