-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema tiendaVideojuegos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tiendaVideojuegos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tiendaVideojuegos` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE `tiendaVideojuegos` ;

-- -----------------------------------------------------
-- Table `tiendaVideojuegos`.`Socios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendaVideojuegos`.`Socios` (
  `CodSocios` INT NOT NULL AUTO_INCREMENT,
  `DNI` VARCHAR(9) NOT NULL,
  `nombre` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_spanish_ci' NULL,
  `apellidos` VARCHAR(45) NULL,
  `telefono` VARCHAR(9) NULL,
  `email` VARCHAR(255) NULL,
  `genero` VARCHAR(20) CHARACTER SET 'utf8' COLLATE 'utf8_spanish_ci' NULL,
  `direccion` TEXT NULL,
  `asociado` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_spanish_ci' NULL,
  PRIMARY KEY (`CodSocios`),
  UNIQUE INDEX `DNI_UNIQUE` (`DNI` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendaVideojuegos`.`Videojuegos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendaVideojuegos`.`Videojuegos` (
  `CodVideojuegos` INT NOT NULL,
  `titulo` VARCHAR(255) CHARACTER SET 'utf8' COLLATE 'utf8_spanish_ci' NOT NULL,
  `plataforma` VARCHAR(255) NULL,
  `desarrolladora` VARCHAR(45) NOT NULL,
  `publisher` VARCHAR(45) NOT NULL,
  `precio` FLOAT NULL,
  `stock` INT NULL,
  PRIMARY KEY (`CodVideojuegos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendaVideojuegos`.`Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendaVideojuegos`.`Factura` (
  `idFactura` INT NOT NULL AUTO_INCREMENT,
  `CodSocios` INT NOT NULL,
  PRIMARY KEY (`idFactura`),
  INDEX `CodSocios_idx` (`CodSocios` ASC),
  CONSTRAINT `CodSocios`
    FOREIGN KEY (`CodSocios`)
    REFERENCES `tiendaVideojuegos`.`Socios` (`CodSocios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendaVideojuegos`.`Det_Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendaVideojuegos`.`Det_Factura` (
  `CodDetFact` INT NOT NULL,
  `CodVideojuegos` INT NOT NULL,
  `Cantidad` INT NOT NULL,
  `Precio` FLOAT NOT NULL,
  `Factura_idFactura` INT NOT NULL,
  PRIMARY KEY (`CodDetFact`),
  INDEX `CodVideojuegos_idx` (`CodVideojuegos` ASC),
  INDEX `fk_Det_Factura_Factura1_idx` (`Factura_idFactura` ASC),
  CONSTRAINT `CodVideojuegos`
    FOREIGN KEY (`CodVideojuegos`)
    REFERENCES `tiendaVideojuegos`.`Videojuegos` (`CodVideojuegos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Det_Factura_Factura1`
    FOREIGN KEY (`Factura_idFactura`)
    REFERENCES `tiendaVideojuegos`.`Factura` (`idFactura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
