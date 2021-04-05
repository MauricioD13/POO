class Car{
    constructor(license,driver){ //nuevas especificaciones de EcmaScript 6
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    printDataCar(){
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
        console.log(this.passenger)
    }
}