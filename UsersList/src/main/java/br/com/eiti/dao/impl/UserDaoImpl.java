package br.com.eiti.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.eiti.dao.AbstractDao;
import br.com.eiti.dao.UserDao;
import br.com.eiti.entity.User;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	@Override
	public List<User> findAllBy(String username, String name, String email) {
		Criteria c = getCriteria();
		c.add(Restrictions.and(
				Restrictions.like("username", "%" + username + "%"),
				Restrictions.like("name", "%" + name + "%"),
				Restrictions.like("email", "%" + email + "%")
		));
		c.addOrder(Order.asc("name"));
		return c.list();
	}

}
