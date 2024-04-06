
import React, { useState,useEffect } from "react";
import { Table, TableHead, TableBody, TableRow, TableCell, Paper } from "@material-ui/core";

const FilterStocks = () => {
 const [data, setData] = useState([]); 
 /*const data = [ {companyName: "Torrent Pharmaceuticals",livePriceDto:"3,0000",closePrice:"2588.65",marketCap:"87616000000000"}, 
 {companyName: "Torren",livePriceDto:"3,0000",closePrice:"2588.65",marketCap:"87616000000000"},
 {companyName: "Tor",livePriceDto:"3,0000",closePrice:"2588.65",marketCap:"87616000000000"}]*/


useEffect(() => {
  fetch('http://localhost:8080/grow/getAllStocks')
    .then((res) => {
      return res.json();
    })
    .then((data) => {
      console.log(data);
      setData(data);
    });
}, []);


  return (
    <Paper>
      <Table style = {{width: '900px', marginTop:'10%', maxHight: '75%'}}>
        <TableHead>
          <TableRow>
            <TableCell>Company Name</TableCell>
            <TableCell>Market Price</TableCell>
            <TableCell>Close Price</TableCell>
            <TableCell>Market Cap</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {data.map((stock) => (
            <TableRow key={stock._id}>
              <TableCell>{stock.companyName}</TableCell>
              <TableCell>{stock.livePriceDto}</TableCell>
              <TableCell>{stock.closePrice}</TableCell>
              <TableCell>{stock.marketCap}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </Paper>
  );
};


export default FilterStocks;