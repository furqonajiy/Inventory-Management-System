import React, { Component } from 'react';
import InventoryService from '../services/InventoryService';

class ListInventoryComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            inventory: []
        }
    }

    componentDidMount() {
        InventoryService.getInventory().then((res) => {
            this.setState({ inventory: res.data });
        });
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Inventory List</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>SKU</th>
                                <th>Main Keywords</th>
                                <th>Inventory Type</th>
                                <th>Notes</th>
                                <th>Use</th>
                                <th>Alternative Keywords</th>
                                <th>BisaDivisi</th>
                                <th>Mass (grams)</th>
                                <th>Hashtag</th>
                                <th>Bukalapak Link</th>
                                <th>Tokopedia Link</th>
                                <th>Shopee Link</th>
                                <th>Actions</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.inventory.map(
                                    inventory =>
                                        <tr key={inventory.sku}>
                                            <td>{inventory.sku}</td>
                                            <td>{inventory.mainKeyword}</td>
                                            <td>{inventory.inventoryType}</td>
                                            <td>{inventory.notes}</td>
                                            <td>{inventory.use}</td>
                                            <td>{inventory.alternativeKeyword}</td>
                                            <td>{inventory.bisaDivisi}</td>
                                            <td>{inventory.massInGram}</td>
                                            <td>{inventory.hashTag}</td>
                                            <td>{inventory.bukalapakLink}</td>
                                            <td>{inventory.tokopediaLink}</td>
                                            <td>{inventory.shopeeLink}</td>
                                        </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListInventoryComponent;