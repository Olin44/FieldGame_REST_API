insert into map(id,name) values ('1', 'Kraków');
insert into map(id,name) values ('2', 'Warszawa');
insert into map(id,name) values ('3', 'Kalisz');
insert into map(id,name) values ('4', 'Wadowice');

insert into object_on_map_details(id, hint, object_type, map_id) values ('3', 'hint1', 1, 1);
insert into object_on_map_details(id, hint, object_type, map_id) values ('4', 'hint2', 0, 1);
insert into object_on_map_details(id, hint, object_type, map_id) values ('5', 'hint3', 1, 2);
insert into object_on_map_details(id, hint, object_type, map_id) values ('6', 'hint4', 1, 3);
insert into object_on_map_details(id, hint, object_type, map_id) values ('7', 'hint5', 0, 3);
insert into object_on_map_details(id, hint, object_type, map_id) values ('8', 'hint6', 1, 2);

insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('1', 255.0, 45.0, 4);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('2', 85.0, 25.0, 3);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('3', 478.0, 672., 5);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('4', 85.0, 25.0, 7);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('5', 255.0, 45.0, 7);
insert into lat_lng(id, latitude, longitude, object_on_map_details_id) values('6', 478.0, 672., 8);

insert into my_user(id, username, password, email, is_active) values ('1', 'user1', 'password1', 'email1@email.pl', true);
insert into my_user(id, username, password, email, is_active) values ('2', 'user2', 'password2', 'email2@email.pl', true);


