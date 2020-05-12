/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  ryanb
 * Created: May 8, 2020
 */
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

CREATE TABLE IF NOT EXISTS `suppliers` (
  `SID` int(11) NOT NULL AUTO_INCREMENT,
  `suppliercode` varchar(100) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Phone` varchar(10) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=143 ;


INSERT INTO `suppliers` (`SID`, `suppliercode`, `Name`, `location`, `phone`) VALUES
(1, 'sup1', 'American Health', '2 Fergus Dr', '123456789'),
(2, 'sup2', 'NOW', '6 Achray St', '1111111111'),
(3, 'sup3', 'Bragg', '63 Well St', '2222222222'),
(4, 'sup4', 'Natural Care', '12 Park Pl', '3333333333');

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `category` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=56 ;

INSERT INTO `users` (`id`, `fullname`, `location`, `phone`, `username`, `password`, `category`) VALUES
(1, 'Ryan Baksh', 'Towson', '123456789', 'user1', 'password', 'ADMINISTRATOR'),
(2, 'Rasheed Saka', 'Towson', '987654321', 'user2', 'password', 'NORMAL USER');

CREATE TABLE IF NOT EXISTS `products` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `productcode` varchar(100) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `costprice` double NOT NULL,
  `sellingprice` double NOT NULL,
  `brand` varchar(50) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=79 ;

INSERT INTO `products` (`pid`, `productcode`, `productname`, `costprice`, `sellingprice`, `brand`) VALUES
(1, 'prod1', 'Viatamin D3', 9.99, 12, 'Vitacost'),
(2, 'prod2', 'Super Enzymes', 20, 25, 'Vitacost'),
(3, 'prod3', 'Whole Psyllium Husk', 6.5, 7.5, 'Vitacost'),
(4, 'prod4', 'Sunflower Lecithin Power', 12.99, 14.99, 'Now'),
(5, 'prod5', 'Probiotic-10', 14, 20, 'Now'),
(6, 'prod6', 'Certified Organic Inulin', 7, 10, 'Now'),
(7, 'prod7', 'Lutein and Zeaxanthin', 15, 20, 'Simple Truth'),
(8, 'prod8', 'L-Lvsine (500mg)', 8.99, 10, 'Simple Truth'),
(9, 'prod9', 'Magnesium Citrate', 14, 20, 'Simple Truth'),
(10, 'prod10', 'Bragg Apple Cider Vinegar', 5.79, 9.99, 'Bragg');

CREATE TABLE IF NOT EXISTS `inventory` (
  `productcode` varchar(100) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `inventory` (`productcode`, `quantity`) VALUES
('prod1', 1),
('prod2', 35),
('prod3', 73),
('prod4', 34),
('prod5', 43),
('prod6', 54),
('prod7', 7),
('prod8', 99),
('prod9', 4),
('prod10', 67);

CREATE TABLE IF NOT EXISTS `purchaseinfo` (
  `purchaseid` int(11) NOT NULL AUTO_INCREMENT,
  `suppliercode` varchar(200) NOT NULL,
  `productcode` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  `quantity` int(11) NOT NULL,
  `totalcost` double NOT NULL,
  PRIMARY KEY (`purchaseid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=30 ;






