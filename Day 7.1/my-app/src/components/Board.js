import React, { Component } from "react";
import "../css/Board.css";
import Note from "./Note";

class Board extends Component {
	constructor() {
		super();
	}

	render() {
		return (
			<div>
				<div className="divBoard">
					<div className="row">
						<Note
						title="note 1"
						body="do a thing"
						/>
						<Note
						title="note 2"
						body="do a thing"
						/>
						<Note
						title="note 3"
						body="do a thing"
						/>
					</div>
				</div>
				<div>
					<button className="btn btn-success add-button">Add</button>
				</div>
			</div>
		);
	}
}

export default Board