package name.qd.dappe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import name.qd.dappe.dto.UserAddress;

public interface UserAddressRepository extends CrudRepository<UserAddress, Integer> {
	List<UserAddress> findAll();
}