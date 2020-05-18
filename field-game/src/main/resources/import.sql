insert into map(id,name) values ('1', 'Kraków - Jacek');
insert into map(id,name) values ('2', 'Kraków - Monika');
insert into map(id,name) values ('3', 'Kalisz');
insert into map(id,name) values ('4', 'Wadowice');

insert into object_on_map_details(id, hint, object_type, map_id) values ('3', 'hint1', 1, 4);
insert into object_on_map_details(id, hint, object_type, map_id) values ('4', 'hint2', 0, 4);
insert into object_on_map_details(id, hint, object_type, map_id) values ('5', 'hint3', 1, 4);
insert into object_on_map_details(id, hint, object_type, map_id) values ('6', 'hint4', 1, 4);
insert into object_on_map_details(id, hint, object_type, map_id) values ('7', 'hint5', 0, 4);
insert into object_on_map_details(id, hint, object_type, map_id) values ('8', 'hint6', 1, 4);

insert into object_on_map_details(id, hint, object_type, map_id) values ('9', 'Kiosk', 1, 2);
insert into object_on_map_details(id, hint, object_type, map_id) values ('10', 'Delikatesy', 2, 2);
insert into object_on_map_details(id, hint, object_type, map_id) values ('11', 'Chińczyk', 1, 2);

insert into object_on_map_details(id, hint, object_type, map_id) values ('12', 'Klub Filutek', 2, 1);
insert into object_on_map_details(id, hint, object_type, map_id) values ('13', 'Lodowisko', 1, 1);
insert into object_on_map_details(id, hint, object_type, map_id) values ('14', 'Basen', 2, 1);

insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('7', 50.0855076,19.9089341, 9);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('8', 50.0854514,19.9111744, 10);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('9', 50.0844259,19.9110967, 11);

insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('10', 50.0855076,19.9089341, 12);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('11', 50.0854514,19.9111744, 13);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('12', 50.0844259,19.9110967, 14);


insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('1', 255.0, 45.0, 4);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('2', 85.0, 25.0, 3);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('3', 478.0, 672., 5);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('4', 85.0, 25.0, 7);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('5', 255.0, 45.0, 6);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('6', 478.0, 672., 8);

insert into my_user(id, username, password, email, is_active) values ('1', 'user1', 'password1', 'email1@email.pl', false);
insert into my_user(id, username, password, email, is_active) values ('2', 'user2', 'password2', 'email2@email.pl', false);
insert into my_user(id, username, password, email, is_active) values ('3', 'Monika', '123456', 'm@m.pl', false);

