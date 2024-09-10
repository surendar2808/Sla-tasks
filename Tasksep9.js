/* 
======================= 1) add element in the last ==================================
var arr=[1,2,3,4,5];
var newnum=45;
arr[arr.length]=newnum;
for(let i=0;i<arr.length;i++)
{
    console.log(arr[i]);
}

======================== 2) remove an Element in the last ===========================
var arr=[1,2,3,4,5,6];
for(let i=0;i<arr.length-1;i++)
{
    console.log(arr[i]);
}

========================= 3) special characters between the elements ======================

var arr=["apple","orange","grapes"];
var special="#";
console.log(arr.join(special)); 

========================= 4) include all the employees details =======================


let employees = [
    {
      EMPID: 101,
      EMPNAME: "John Doe",
      EMPSALARY: 50000,
      EMPDESIGNATION: "Software Engineer"
    },
    {
      EMPID: 102,
      EMPNAME: "Jane Smith",
      EMPSALARY: 60000,
      EMPDESIGNATION: "Project Manager"
    },
    {
      EMPID: 103,
      EMPNAME: "David Johnson",
      EMPSALARY: 45000,
      EMPDESIGNATION: "Quality Analyst"
    }
  ];
  
  // Display 3 employee objects
  employees.forEach(employee => {
    console.log(`ID: ${employee.EMPID}, Name: ${employee.EMPNAME}, Salary: ${employee.EMPSALARY}, Designation: ${employee.EMPDESIGNATION}`);
  });
  */
