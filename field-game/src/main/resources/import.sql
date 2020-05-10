insert into lat_lng(id, latitude, longitude) values('2', 85.0, 25.0);
insert into lat_lng(id, latitude, longitude) values('1', 478.0, 892.0);
insert into map(id,name) values ('1', 'Kraków');
insert into map(id,name) values ('2', 'Warszawa');
insert into object_on_map_details(id, hint, object_type, lat_lng_id, map_id) values ('2', 'hint1', 1, 1, 1);
insert into object_on_map_details(id, hint, object_type, lat_lng_id, map_id) values ('3', 'hint2', 1, 1, 1);
insert into object_on_map_details(id, hint, object_type, lat_lng_id, map_id) values ('4', 'hint3', 1, 1, 2);
insert into my_user(id, username, password, email, is_active) values ('1', 'user1', 'password1', 'email1@email.pl', true);
insert into my_user(id, username, password, email, is_active) values ('2', 'user2', 'password2', 'email2@email.pl', true);


