import React, { Component } from 'react';

class Header extends Component {
  render() {
    let headerTabs = this.props.tabs.map((tab, key) =>
      <button key = {key}>{tab}</button>
    )

    return (
      <div className = "nav-buttons">
      {headerTabs}
      </div>
    )
  }
}

export default Header;
