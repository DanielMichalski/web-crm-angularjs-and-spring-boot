----------------------------------------------------------------------
-- users
----------------------------------------------------------------------

INSERT INTO users (id, name) VALUES
  (1, 'John Black'),
  (2, 'Megan Quemby'),
  (3, 'Gannon Zelenia'),
  (4, 'Theodore Erin'),
  (5, 'Naida Hayden');


----------------------------------------------------------------------
-- company_sectors
----------------------------------------------------------------------

INSERT INTO company_sectors (id, name) VALUES
  (1, 'Online shpp'),
  (2, 'Publishing house'),
  (3, 'Clothing manufacturer'),
  (4, 'Manufacturer supplements'),
  (5, 'Advertising Agency');


----------------------------------------------------------------------
-- clients
----------------------------------------------------------------------

INSERT INTO clients (id, company_name, contact_name, contact_phone, contact_email, account_manager_id, notes, sector_id)
VALUES
  (1, 'Lorem ipsum dolor', 'Naida Sydney', '53 790 92 21', 'NaidaSydney@dayrep.com', 1,
   'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.',
   5),
  (2, 'Aenean massa', 'Theodore Arden', '88 434 60 33', 'TheodoreArden@dayrep.com', 2, NULL, 4),
  (3, 'Nullam dictum', 'Jorden Dolan', '67 431 58 98', 'JordenDolan@dayrep.com', 3, 'Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu.', 3),
  (4, 'Aliquam lorem ante', 'Shaine Bryar', '78 931 86 71', 'ShaineBryar@dayrep.com', 4, 'In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus.', 2),
  (5, 'Maecenas tempus', 'Jamalia Kelsey', '79 319 44 99', 'JamaliaKelsey@teleworm.us', 5, NULL, 1),
  (6, 'Donec sodales sagittis', 'Jarrod Lee', '66 796 79 49', 'JarrodLee@jourrapide.com', 1, 'Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu.', 1),
  (7, 'Vestibulum purus', 'Jackson Howard', '53 858 22 59', 'JacksonHoward@jourrapide.com', 2, NULL, 2),
  (8, 'Etiam sit', 'Tana Bryar', '67 677 77 97', 'TanaBryar@jourrapide.com', 3, 'Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.', 3),
  (9, 'Cras id dui', 'Brynne Tana', '78 772 75 31', 'BrynneTana@rhyta.com', 4, 'Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui.', 4),
  (10, 'Duis arcu tortor', 'Rhea Julian', '69 268 36 68', 'RheaJulian@armyspy.com', 5, NULL, 5),
  (11, 'Phasellus accumsan', 'Howard Brielle', '78 357 89 49', 'HowardBrielle@armyspy.com', 1, 'Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero.', 5),
  (12, 'Pellentesque posuere', 'Omar Jamalia', '88 706 67 24', 'OmarJamalia@jourrapide.com', 2, NULL, 3),
  (13, 'Aenean viverra', 'Abigail Sasha', '53 218 38 56', 'AbigailSasha@teleworm.us', 3, NULL, 1),
  (14, 'Phasellus gravida', 'Rajah Shaine', '79 435 93 31', 'RajahShaine@armyspy.com', 4, NULL, 2),
  (15, 'Phasellus volutpat', 'Raja Sierra', '79 532 30 44', 'RajaSierra@jourrapide.com', 5,
   'Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante.', 4);


----------------------------------------------------------------------
-- contact_timeline
----------------------------------------------------------------------

INSERT INTO contact_timeline (id, client_id, user_id, contact_date, contact_type, notes) VALUES
  (1, 1, 1, '2015-01-12 12:00:00', 'phone', 'Lorem ipsum dolor sit amet enim. Etiam ullamcorper. Suspendisse a pellentesque dui, non felis. Maecenas malesuada elit lectus felis, malesuada ultricies. Curabitur et ligula.'),
  (2, 1, 2, '2015-01-14 18:30:00', 'envelope-o', 'Ut molestie a, ultricies porta urna. Vestibulum commodo volutpat a, convallis ac.'),
  (3, 1, 3, '2015-01-16 13:15:00', 'phone', 'Phasellus fermentum in, dolor. Pellentesque facilisis. Nulla imperdiet sit amet magna. Vestibulum dapibus, mauris nec malesuada fames ac turpis velit, rhoncus eu.'),
  (4, 1, 2, '2015-01-16 15:00:00', 'users', 'Quisque lorem tortor fringilla sed, vestibulum id, eleifend justo vel bibendum sapien massa ac turpis faucibus orci luctus non, consectetuer lobortis quis, varius in, purus.'),
  (5, 1, 1, '2015-01-20 12:00:00', 'file-text-o', 'Cum sociis natoque penatibus et ultrices volutpat. Nullam wisi ultricies.');
