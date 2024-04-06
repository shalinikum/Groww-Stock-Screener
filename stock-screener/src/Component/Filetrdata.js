import React, { useState } from 'react';
import { Checkbox, Typography,TextField } from '@material-ui/core';

const Item = ({ text, checked, onClick }) => (
  <div style={{ margin: '10px', display: 'flex' }} className="c11Default valign-wrapper c11Pointer" onClick={onClick}>
    <div className="valign-wrapper">
      <Checkbox checked={checked}/>
    </div>
    <div className="contentPrimary bodyBase">
      <Typography style={{ maxWidth: '200px' }}>{text}</Typography>
    </div>
  </div>
);

const IndexItem = ({ text, checked, onClick }) => (
  <div style={{ margin: '0px', display: 'flex', alignContent: 'center'}} className="c11Default valign-wrapper c11Pointer" onClick={onClick}>
    <div className="valign-wrapper">
      <Checkbox checked={checked}/>
    </div>
    <div className="contentPrimary bodyBase">
      <Typography style={{ maxWidth: '200px'}}>{text}</Typography>
    </div>
  </div>
);

const FilterData = () => {
  const [items, setItems] = useState([
    { text: "Pesticides & Agrochemicals", checked: false },
    { text: "Aquaculture", checked: false },
    { text: "Fertilizers", checked: false },
    { text: "Floriculture", checked: false },
    { text: "Agriculture", checked: false }
  ]);

  const [indexItems, setIndexItems] = useState([
    { text: "Nifty Bank", checked: false },
    { text: "Nifty Next 50", checked: false },
    { text: "Nifty Midcap 100", checked: false },
    { text: "SENSEX", checked: false },
    { text: "Nifty 50", checked: false },
    { text: "Nifty 100", checked: false },
    { text: "BSE 100", checked: false }
  ]);

  const toggleItem = (index, items, setItems) => {
    const newItems = [...items];
    newItems[index].checked = !newItems[index].checked;
    setItems(newItems);
  };

  const handleSearchChange = (event) => {
   // Implement search/filter logic here
   console.log("Search term:", event.target.value);
 };

  return (
    <div style={{ display: 'block', height: '400px'}}>
      <div style={{ margin: '16px 0px 4px 2px' }}>
        <h1>Filter Stocks</h1>
        <TextField
          label="Search"
          variant="outlined"
          onChange={handleSearchChange}
          style={{
           marginBottom: '16px',
           width: '80%',
           padding:'0px !important',
           border: 'none',
           borderRadius: '20px',
           fontSize: '14px',
         }}
        />
        {items.map((item, index) => (
          <Item key={index} text={item.text} checked={item.checked} onClick={() => toggleItem(index, items, setItems)} />
        ))}
        <h1>Index Items</h1>
        {indexItems.map((item, index) => (
          <IndexItem key={index} text={item.text} checked={item.checked} onClick={() => toggleItem(index, indexItems, setIndexItems)} />
        ))}
      </div>
    </div>
  );
};

export default FilterData;